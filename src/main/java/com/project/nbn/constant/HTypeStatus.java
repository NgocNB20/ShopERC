package com.project.nbn.constant;

import com.project.nbn.util.EnumTypeUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HTypeStatus implements EnumType {

    // PDR Migrate Customization from here
    /** 今すぐお届け分 */
    DELIVER_NOW("今すぐお届け", "1"),

    /** 予約可能分(取りおき) */
    RESERVABLE("予約", "2"),

    /** 入荷次第お届け分 */
    DEPENDING_ON_RECEIPT("入荷次第お届け", "3");

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public String getValue() {
        return null;
    }

    private String label;
    /**
     * 区分値<br/>
     */
    private String value;

    /**
     * doma用ファクトリメソッド
     */
    public static HTypeStatus of(String value) {

        HTypeStatus hType = EnumTypeUtil.getEnumFromValue(HTypeStatus.class, value);
        return hType;
    }
    // PDR Migrate Customization to here
}
