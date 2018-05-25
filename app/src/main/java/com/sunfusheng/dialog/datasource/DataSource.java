package com.sunfusheng.dialog.datasource;

import com.sunfusheng.dialog.PopupMenuActivity;
import com.sunfusheng.dialog.R;

/**
 * @author sunfusheng on 2018/5/24.
 */
public class DataSource {

    public enum MainItemConfig {
        NULL(0, null),
        TOAST(R.string.toast, null),
        DIALOG(R.string.dialog, null),
        BOTTOM_SHEET(R.string.bottom_sheet, null),
        POPUP_MENU(R.string.popup_menu, PopupMenuActivity.class);

        public int titleId;
        public Class<?> intentClass;

        MainItemConfig(int titleId) {
            this.titleId = titleId;
        }

        MainItemConfig(int resId, Class<?> intentClass) {
            this.titleId = resId;
            this.intentClass = intentClass;
        }
    }

    public static MainItemConfig[][] mainItems = {
            {MainItemConfig.NULL, MainItemConfig.TOAST, MainItemConfig.DIALOG},
            {MainItemConfig.NULL, MainItemConfig.BOTTOM_SHEET, MainItemConfig.POPUP_MENU}
    };

    public static String[][] popupMenuItems = {
            {null, "1. long click me!", "2. long click me!", "3. long click me!"},
            {null, "4. long click me!", "5. long click me!", "6. long click me!"},
            {null, "7. long click me!", "8. long click me!", "9. long click me!"},
            {null, "10. long click me!", "11. long click me!", "12. long click me!"},
            {null, "13. long click me!", "14. long click me!", "15. long click me!"}
    };
}
