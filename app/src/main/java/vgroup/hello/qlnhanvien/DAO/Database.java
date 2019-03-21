package vgroup.hello.qlnhanvien.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "QLNhanVien";
    private static int DATABASE_VERSION = 1;

    private static String TABLE_NHANVIEN = "NhanVien";
    private static String MaNV_NhanVien = "MaNV";
    private static String TenNV_NhanVien = "TenNV";
    private static String SDT_NhanVien = "SoDT";
    private static String GioiTinh_NhanVien = "GioiTinh";
    private static String DiaChi_NhanVien = "DiaChi";
    private static String Email_NhanVien = "Email";
    private static String Luong_NhanVien = "Luong";

    private static String TABLE_PHONGBAN = "PhongBan";
    private static String MaPB_PhongBan = "MaPB";
    private static String TenPB_PhongBan = "TenPB";

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String taoBangNhanVien = "create table " + TABLE_NHANVIEN + "(" + MaNV_NhanVien +
                " Integer primary key autoincrement, " + TenNV_NhanVien + " text," +
                SDT_NhanVien + " text," + GioiTinh_NhanVien + " text," +
                DiaChi_NhanVien + " text," + Email_NhanVien + " text," +
                Luong_NhanVien + " Integer, " + MaPB_PhongBan + " integer Constraint PK_MAPB_NhanVien references PhongBan(MaPB)," + ")";

        String taoBangPhongBan = "create table " + TABLE_PHONGBAN + "(" + MaPB_PhongBan +
                " Integer primary key autoincrement, " + TenPB_PhongBan + " text " + ")";

        db.execSQL(taoBangPhongBan);
        db.execSQL(taoBangNhanVien);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + TABLE_NHANVIEN);
        db.execSQL("drop table if exists " + TABLE_PHONGBAN);
    }
}
