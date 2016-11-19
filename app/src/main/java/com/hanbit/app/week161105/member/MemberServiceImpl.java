package com.hanbit.app.week161105.member;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-11-12.
 */

public class MemberServiceImpl implements MemberService{
    MemberDAO dao;
    public MemberServiceImpl(Context context) {
        dao = new MemberDAO(context);
    }

    @Override
    public void join(MemberDTO param) {
        Log.d("JOIN ID: ",param.getId());
        Log.d("JOIN PW: ",param.getPw());
        Log.d("JOIN NAME: ",param.getName());
        Log.d("JOIN EMAIL: ",param.getEmail());
        Log.d("JOIN PHONE: ",param.getPhone());
        Log.d("JOIN ADDRESS: ",param.getAddr());
        dao.insert(param);
    }

    @Override
    public int count() {
        int count = 0;
        return count;
    }

    @Override
    public MemberDTO detail(String id) {
        return dao.selectOne(id);
    }

    @Override
    public ArrayList<MemberDTO> list() {
        return dao.selectList();
    }

    @Override
    public boolean login(MemberDTO param) {
        return param.getPw().equals(dao.login(param).getPw());

    }

    @Override
    public void update(MemberDTO param) {

    }

    @Override
    public void delete(String id) {
        dao.delete(id);
    }
}
