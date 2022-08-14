package BanHangMayTinh.impl;

import BanHangMayTinh.IMayTinh;
import DTO.MayTinh;

import java.util.Date;
import java.util.LinkedList;

public class MayTinhService implements IMayTinh {

    static LinkedList<MayTinh> listMayTinh =new LinkedList<>();

    @Override
    public LinkedList<MayTinh> getAll() {
        if(listMayTinh.size() >0 ) {
            return listMayTinh;
        }
        return dataMay();
    }

    @Override
    public void editMay(MayTinh newMay) {
        for (MayTinh mayTinh: listMayTinh
             ) {
            if (mayTinh.getIdMay().equals(newMay.getIdMay()));
            mayTinh.setTenMay(newMay.getTenMay());
            // mayTinh.setPrice(newMay.getPrice());
            // mayTinh.setQuantity(newMay.getQuantity());
        }
        }

    @Override
    public void insertMay(MayTinh mayTinh) {
        listMayTinh.add(mayTinh);
    }

    @Override
    public MayTinh findById(Long idMay) {
        for (MayTinh mayTinh : listMayTinh
        ) {
            if (mayTinh.getIdMay().equals(idMay)) {
                return mayTinh;
            }
        } return null;
    }
    @Override
    public void deleteMay(Long idMay) {
        for (MayTinh mayTinh: dataMay()
             ) {
            if (mayTinh.getIdMay().equals(idMay));
            listMayTinh.remove(mayTinh);
            break;
        }
    }


    @Override
    public void displayData(LinkedList<MayTinh> mayTinhs) {
        for (MayTinh mayTinh: mayTinhs
             ) {
            System.out.println("id "+ mayTinh.getIdMay());
            System.out.println("tên máy "+ mayTinh.getTenMay());
            System.out.println("Giá máy "+ mayTinh.getPrice());
            System.out.println("Số lượng máy "+ mayTinh.getQuantity());
        }
    }

    @Override
    public void getCost(int quantity, float price) {
        System.out.println(" Bill " + (quantity*price));
    }


    public static LinkedList<MayTinh> dataMay() {
        listMayTinh.add(new MayTinh(1L, new Date("2022/08/13"), 9L, "Mac", 3, 400));
        listMayTinh.add(new MayTinh(2L, new Date ("2022/08/13"), 6L, "Mac", 3, 450));
        listMayTinh.add(new MayTinh(3L, new Date ("2022/08/13"), 8L, "Mac", 3, 420));
        listMayTinh.add(new MayTinh(4L, new Date ("2022/08/13"), 3L, "Mac", 3, 460));
        return listMayTinh;
    }

    }


