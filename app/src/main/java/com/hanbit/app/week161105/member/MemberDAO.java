package com.hanbit.app.week161105.member;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

import static com.hanbit.app.week161105.global.Member.ADDR;
import static com.hanbit.app.week161105.global.Member.EMAIL;
import static com.hanbit.app.week161105.global.Member.ID;
import static com.hanbit.app.week161105.global.Member.NAME;
import static com.hanbit.app.week161105.global.Member.PHONE;
import static com.hanbit.app.week161105.global.Member.PHOTO;
import static com.hanbit.app.week161105.global.Member.PW;
import static com.hanbit.app.week161105.global.Member.TABLE;

/**
 * Created by 1027 on 2016-11-12.
 */

public class MemberDAO extends SQLiteOpenHelper{


    public MemberDAO(Context context) {
        super(context, "hanbit2.db", null, 1);
        this.getWritableDatabase();
        Log.d("DB생성","======SUCCESS=====");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS "+ TABLE+"\n" +
                "(\n" +
                ID+" text primary key,\n" +
                PW+" text,\n" +
                NAME+" text,\n" +
                EMAIL+" text,\n" +
                PHONE+" text,\n" +
                PHOTO+" text,\n" +
                ADDR+" text" +
                ");");
        db.execSQL("INSERT INTO "+ TABLE+" ("+ ID
                +", "+ PW+", "+ NAME+", "+ EMAIL+", "
                + PHONE+", "+ PHOTO+", "+ ADDR+")\n" +
                "VALUES ('hong','1','GilDong','hong@test.com','010-1234-5678','default.jpg','Seoul');");
        db.execSQL("INSERT INTO "+ TABLE+" ("+ ID
                +", "+ PW+", "+ NAME+", "+ EMAIL+", "
                + PHONE+", "+ PHOTO+", "+ ADDR+")\n" +
                "VALUES ('kim','1','Yousin','hong@test.com','010-1234-5678','default.jpg','Seoul');");
        db.execSQL("INSERT INTO "+ TABLE+" ("+ ID
                +", "+ PW+", "+ NAME+", "+ EMAIL+", "
                + PHONE+", "+ PHOTO+", "+ ADDR+")\n" +
                "VALUES ('Park','1','Jiwon','hong@test.com','010-1234-5678','default.jpg','Seoul');");
        db.execSQL("INSERT INTO "+ TABLE+" ("+ ID
                +", "+ PW+", "+ NAME+", "+ EMAIL+", "
                + PHONE+", "+ PHOTO+", "+ ADDR+")\n" +
                "VALUES ('Go','1','Chang','hong@test.com','010-1234-5678','default.jpg','Seoul');");
        db.execSQL("INSERT INTO "+ TABLE+" ("+ ID
                +", "+ PW+", "+ NAME+", "+ EMAIL+", "
                + PHONE+", "+ PHOTO+", "+ ADDR+")\n" +
                "VALUES ('Kang','1','Ta','hong@test.com','010-1234-5678','default.jpg','Seoul');");
        db.execSQL("INSERT INTO "+ TABLE+" ("+ ID
                +", "+ PW+", "+ NAME+", "+ EMAIL+", "
                + PHONE+", "+ PHOTO+", "+ ADDR+")\n" +
                "VALUES ('Moon','1','Heejoon','hong@test.com','010-1234-5678','default.jpg','Seoul');");
        Log.d("Memer Table 생성","======SUCCESS=====");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(MemberDTO param){
        Log.d("DAO JOIN ID: ",param.getId());
        Log.d("DAO JOIN PW: ",param.getPw());
        Log.d("DAO JOIN NAME: ",param.getName());
        Log.d("DAO JOIN EMAIL: ",param.getEmail());
        Log.d("DAO JOIN PHONE: ",param.getPhone());
        Log.d("DAO JOIN ADDRESS: ",param.getAddr());
        String sql = "";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
    }
    public int selectCount(){
        int count = 0;
        return count;
    }
    public MemberDTO selectOne(String id){
        MemberDTO member = new MemberDTO();
        return member;
    }
    public ArrayList<MemberDTO> selectList(){
        String sql = "SELECT "+String.format("%s,%s,%s,%s,%s,%s,%s",ID,PW,NAME,EMAIL,PHONE,PHOTO,ADDR)
                +" FROM member;";
        ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        if(cursor != null){
            Log.d("DAO LIST IS","EXIST");
            cursor.moveToFirst();
        }
        do{
            MemberDTO temp = new MemberDTO();
            temp.setId(cursor.getString(0));
            temp.setPw(cursor.getString(1));
            temp.setName(cursor.getString(2));
            temp.setEmail(cursor.getString(3));
            temp.setPhone(cursor.getString(4));
            temp.setPhoto(cursor.getString(5));
            temp.setAddr(cursor.getString(6));
            list.add(temp);
        }while(cursor.moveToNext());

        return list;
    }
    public MemberDTO login(MemberDTO param){
        Log.d("DAO LOGIN ID: ",param.getId());
        Log.d("DAO LOGIN PW: ",param.getPw());
        String sql = "SELECT "+ PW+
                " FROM "+ TABLE+" WHERE id = '"+param.getId()+"';";
        MemberDTO member = new MemberDTO();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        if(cursor.moveToNext()){
            member.setPw(cursor.getString(0));
        }
        Log.d("PW",member.getPw());
        return member;
    }
    public void update(MemberDTO param){

    }
    public void delete(MemberDTO param){

    }
}
