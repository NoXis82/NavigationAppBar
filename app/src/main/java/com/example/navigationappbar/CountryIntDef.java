package com.example.navigationappbar;

import androidx.annotation.IntDef;

@IntDef({CountryIntDef.RUS, CountryIntDef.UKR, CountryIntDef.BLR})

public @interface CountryIntDef {

    int RUS = 0;

    int UKR = 1;

    int BLR = 2;


}
