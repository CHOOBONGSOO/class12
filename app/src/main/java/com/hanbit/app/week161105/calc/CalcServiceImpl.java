package com.hanbit.app.week161105.calc;

/**
 * Created by 1027 on 2016-11-05.
 */

public class CalcServiceImpl implements CalcService{
    @Override
    public int plus(CalcDTO dto) {
        return dto.getFirst()+dto.getSecond();
    }

    @Override
    public int minus(CalcDTO dto) {
        return dto.getFirst()-dto.getSecond();
    }

    @Override
    public int multi(CalcDTO dto) {
        return dto.getFirst()*dto.getSecond();
    }

    @Override
    public int divid(CalcDTO dto) {
        return dto.getFirst()/dto.getSecond();
    }

    @Override
    public int mod(CalcDTO dto) {
        return dto.getFirst()%dto.getSecond();
    }
}
