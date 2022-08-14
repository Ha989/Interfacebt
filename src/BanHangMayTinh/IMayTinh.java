package BanHangMayTinh;

import DTO.MayTinh;

import java.util.LinkedList;

public interface IMayTinh {

    LinkedList<MayTinh> getAll();

    void editMay(MayTinh mayTinh);

    void insertMay(MayTinh mayTinh);

    MayTinh findById(Long idMay);

    void deleteMay(Long idMay);

    void displayData(LinkedList<MayTinh> mayTinhs);

    void getCost(int quantity, float price);

}