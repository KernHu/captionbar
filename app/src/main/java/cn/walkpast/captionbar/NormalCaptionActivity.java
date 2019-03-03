package cn.walkpast.captionbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cn.walkpast.caption.CaptionActivity;
import cn.walkpast.caption.bar.NormalCaptionBar;


/**
 * Author: Kern
 * Time: 2019/2/28 11:10
 * Description: This is..
 */

public class NormalCaptionActivity extends CaptionActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getConfig()
                .setLayoutResID(R.layout.activity_normal_caption)
                .setOrientationPortrait(true)
                .setStatusbarBgc(R.color.default_statusbar_background)
                .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                .setCaptionBarBgc(R.color.default_caption_background)
                .setCaptionBar(new NormalCaptionBar()
                        .setContext(this)
                        .setTextColor(R.color.default_text_color)
                        .setTextSize(15)
                        //.setLeftText(getString(R.string.caption_left_btn))
                        .setLeftIcon(R.drawable.ic_back)
                        //.setRightText(getString(R.string.caption_right_btn))
                        .setRightIcon(R.drawable.ic_menu)
                        .setTitleText("LeftBtn-Title-RightBtn")
                        .setLeftBtnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                finish();
                            }
                        })
                        .setRightBtnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(NormalCaptionActivity.this, "RightBtn", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .createView()
                )
                .build();
    }
}