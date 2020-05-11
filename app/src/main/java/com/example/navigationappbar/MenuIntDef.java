package com.example.navigationappbar;

import androidx.annotation.IntDef;

@IntDef({MenuIntDef.NOTES, MenuIntDef.PAY, MenuIntDef.TASK, MenuIntDef.DELIVERY})
public @interface MenuIntDef {

    int NOTES = R.id.action_open_notes;

    int PAY = R.id.action_open_pay;

    int TASK = R.id.action_open_task;

    int DELIVERY = R.id.action_open_delivery;
}

