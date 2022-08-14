package BanHangMayTinh;

import DTO.Color;

import java.util.LinkedList;

public interface IColor {

    LinkedList<Color> getAll();


    void editColor(Color newcolor);

    void insertColor(Color Color);

   Color findByColorId(Long colorId);

    void deleteColor(Long colorId);

    void displayData(LinkedList<Color> colors);


}
