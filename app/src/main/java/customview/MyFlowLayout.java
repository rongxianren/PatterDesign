package customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rongxianren.patterdesign.R;

/**
 * Created by wty on 16/9/27.
 */
public class MyFlowLayout extends ViewGroup {

    private final int verticalSpacing = 20;
    private final int horizontalSpacing = 10;

    private final int margin = 15;

    private String[] tagItems;

    public MyFlowLayout(Context context) {
        this(context, null);
    }

    public MyFlowLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        pareseAttr(attrs);
        initView();
    }

    private void pareseAttr(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyFlowLayout);
        String tagStr = typedArray.getString(R.styleable.MyFlowLayout_item_array);
        tagItems = tagStr.split("-");
    }

    private void initView() {
        int lenght = tagItems.length;
        MarginLayoutParams params = new MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        for (int i = 0; i < lenght; i++) {
            TextView tag = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.tag_layout, null, false);
            tag.setBackgroundResource(R.drawable.tag_bg_shape);
            tag.setText(tagItems[i]);
            tag.setGravity(Gravity.CENTER);
            tag.setLayoutParams(params);
            this.addView(tag);
        }
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSpecSize = MeasureSpec.getSize(widthMeasureSpec);

        int heightSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSpecSize = MeasureSpec.getSize(heightMeasureSpec);

        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();

        int widthUsed = paddingLeft + paddingRight;
        int heightUsed = paddingTop + paddingBottom;

        int theMaxHeightInLine = 0;

        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            measureChild(view, widthMeasureSpec, heightMeasureSpec);

            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();

            ViewGroup.MarginLayoutParams childLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;


            int childWidthUsed = view.getMeasuredWidth() + childLayoutParams.leftMargin + childLayoutParams.rightMargin;
            int childHeightUsed = view.getMeasuredHeight() + childLayoutParams.leftMargin + childLayoutParams.rightMargin;

            if (widthUsed + childWidthUsed + horizontalSpacing < widthSpecSize) {
                widthUsed += childWidthUsed + horizontalSpacing;
                if (childHeightUsed > theMaxHeightInLine) {
                    theMaxHeightInLine = childHeightUsed;
                }
            } else {
                heightUsed += theMaxHeightInLine + verticalSpacing;
                theMaxHeightInLine = childHeightUsed;
                widthUsed = paddingLeft + paddingRight + childWidthUsed + horizontalSpacing;
            }
        }

        heightUsed = heightUsed + theMaxHeightInLine;
        setMeasuredDimension(widthSpecSize, heightUsed);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();

        int startLayoutX = paddingLeft;
        int startLayoutY = paddingTop;

        int widthUsed = paddingLeft + paddingRight;

        int childMaxHeight = 0;

        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            int top = 0, left = 0, right = 0, bottom = 0;
            if (GONE != view.getVisibility()) {
                int childWidthUsed = view.getMeasuredWidth();
                int childHeightUsed = view.getMeasuredHeight();

                LayoutParams params = view.getLayoutParams();
                MarginLayoutParams layoutParams = (MarginLayoutParams) params;

                childWidthUsed += layoutParams.leftMargin + layoutParams.rightMargin;
                childHeightUsed += layoutParams.leftMargin + layoutParams.rightMargin;

                if (widthUsed + childWidthUsed + horizontalSpacing < r - l) {
                    if (childHeightUsed > childMaxHeight) {
                        childMaxHeight = childHeightUsed;
                    }
                    top = startLayoutY;
                    left = startLayoutX + horizontalSpacing;
                    right = left + childWidthUsed;
                    bottom = top + childHeightUsed;
                    widthUsed += childWidthUsed + horizontalSpacing;
                    startLayoutX += childWidthUsed + horizontalSpacing;
                } else {
                    startLayoutY += childMaxHeight + verticalSpacing;
                    startLayoutX = paddingLeft + horizontalSpacing;
                    widthUsed = paddingLeft + paddingRight + horizontalSpacing;

                    top = startLayoutY;
                    left = startLayoutX;
                    right = left + childWidthUsed;
                    bottom = top + childHeightUsed;

                    widthUsed += childWidthUsed;
                    startLayoutX += childWidthUsed;
                    childMaxHeight = childHeightUsed;
                }
            }
            view.layout(left, top, right, bottom);
        }
    }
}
