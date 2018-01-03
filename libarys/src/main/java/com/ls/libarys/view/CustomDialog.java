package com.ls.libarys.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Administrator on 2017/5/25.
 */

public class CustomDialog extends Dialog {

    private static int default_width = 120; // Ĭ�Ͽ��
    private static int default_height = 120;// Ĭ�ϸ߶�

    public CustomDialog(Context context) {
        super(context);
    }

    public CustomDialog(Context context, int layout, int style) {
        this(context, default_width, default_height, layout, style);
    }

    public CustomDialog(Context context, int width, int height, int layout,
                        int style) {
        super(context, style);
        // ��������
        setContentView(layout);
        // ���ô�������
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        // ���ÿ�ȡ��߶ȡ��ܶȡ����뷽ʽ
        float density = getDensity(context);
        params.width = (int) (width * density);
        params.height = (int) (height * density);
        params.gravity = Gravity.CENTER;
        window.setAttributes(params);

    }

    /**
     * ��ȡ��ʾ�ܶ�
     *
     * @param context
     * @return
     */
    public float getDensity(Context context) {
        Resources res = context.getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        return dm.density;
    }

}
