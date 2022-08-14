package BanHangMayTinh.impl;

import BanHangMayTinh.IColor;
import DTO.Color;

import java.util.Date;
import java.util.LinkedList;

public class ColorService implements IColor {
    static LinkedList<Color> listColor = new LinkedList<>();
    @Override
    public LinkedList<Color> getAll() {
        if (listColor.size() >0) {
            return listColor;
        }
        return dataColor();
    }

    @Override
    public void editColor(Color newColor) {
        for (Color color: listColor
             ) {
            if (color.getColorId().equals(newColor.getColorId()));
            color.setTenMau(newColor.getTenMau());
        }
    }

    @Override
    public void insertColor(Color color) {
        listColor.add(color);
    }



    @Override
    public Color findByColorId(Long colorId) {
        for (Color color: listColor
        ) {
            if (color.getColorId().equals(colorId))
                return color;
        }
        return null;
    }


    @Override
    public void deleteColor(Long idColor) {
        for (Color color: dataColor()
             ) {
            if (color.getColorId().equals(idColor));
            listColor.remove(color);
            break;
        }
    }

    @Override
    public void displayData(LinkedList<Color> colors) {
        for (Color color: colors
             ) {
            System.out.println("id màu " + color.getColorId());
            System.out.println("Tên màu " + color.getTenMau());
        }
    }
    public static LinkedList<Color> dataColor() {
        listColor.add(new Color(1L, new Date("2022/08/13"), 21L, "Trắng"));
        listColor.add(new Color(2L, new Date ("2022/08/13"), 22L, "Đen"));
        listColor.add(new Color(3L,new Date ("2022/08/13"), 23L, "vàng"));
        listColor.add(new Color(4L, new Date ("2022/08/13"), 24L, "bạc"));
        return listColor;
    }
}
