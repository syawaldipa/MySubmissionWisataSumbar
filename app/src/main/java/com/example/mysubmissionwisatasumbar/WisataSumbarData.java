package com.example.mysubmissionwisatasumbar;

import java.util.ArrayList;

public class WisataSumbarData {
    public static String[][] data  = new String[][]{
            {"Pantai Air Manis","Kota Padang","http://imgcdn.rri.co.id/thumbs/berita_694093_800x600_9__IMG_0714_Pantai_Air_Manis_menggabungkan_panorama_laut_pesisir_barat_Sumatera_dengan_kisah_legenda_Malin_Kundang.jpg"},
            {"Puncak Gagoan","Kota Solok","https://wisatasumatera.com/wp-content/uploads/2016/11/PhotoGrid_1469333957763.jpg"},
            {"Danau Singkarak","Kota Solok","https://wisatasumatera.com/wp-content/uploads/2016/11/Danau-Singkarak.jpg"},
            {"Kebun Teh Alahan Panjang","Kabupaten Solok","https://wisatasumatera.com/wp-content/uploads/2016/11/13731129_1576696522640053_537668767_n-1068x668.jpg"},
            {"Jam Gadang","Kota Bukittinggi","https://wisatasumatera.com/wp-content/uploads/2016/11/sumbar.jpg"},
            {"Jembatan Limpapeh","Kota Bukittinggi","https://wisatasumatera.com/wp-content/uploads/2016/11/12912343_1718454751769273_119459793_n-1068x675.jpg"},
            {"Lobang Jepang Bukittinggi","Kota Bukittinggi","https://wisatasumatera.com/wp-content/uploads/2016/11/13722272_521284051406715_870513201_n-1068x710.jpg"},
            {"Jembatan Kelok Sembilan","Kota Payakumbuh","https://wisatasumatera.com/wp-content/uploads/2016/11/kelok.jpg"},
            {"Bukik Bulek Taram","Kota Payakumbuh","https://wisatasumatera.com/wp-content/uploads/2016/11/13260988_1169062819800809_127018726_n-1068x678.jpg"},
            {"Kapalo Banda Taram","Kota Payakumbuh","https://wisatasumatera.com/wp-content/uploads/2016/11/Kapalo-Banda-Taram-2-900x580.jpg"},

    };
    public static ArrayList<WisataSumbar> getListData(){
        ArrayList<WisataSumbar> list = new ArrayList<>();
        for (String[] aData : data) {
            WisataSumbar wisataSumbar = new WisataSumbar();
            wisataSumbar.setName(aData[0]);
            wisataSumbar.setLocation(aData[1]);
            wisataSumbar.setPhoto(aData[2]);
            list.add(wisataSumbar);
        }
        return list;
    }
}

