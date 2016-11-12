package com.hanbit.app.week161105.calc;

/**
 * Created by 1027 on 2016-11-05.
 */

public interface CalcService {
    public int plus(CalcDTO dto);
    public int minus(CalcDTO dto);
    public int multi(CalcDTO dto);
    public int divid(CalcDTO dto);
    public int mod(CalcDTO dto);
}
