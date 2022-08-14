package BhmtChtr;

import BanHangMayTinh.IColor;
import BanHangMayTinh.IMayTinh;
import BanHangMayTinh.IOrder;
import BanHangMayTinh.impl.ColorService;
import BanHangMayTinh.impl.MayTinhService;
import BanHangMayTinh.impl.OrderService;
import DTO.Color;
import DTO.MayTinh;
import DTO.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ChayCtr {

    static Scanner sc = new Scanner(System.in);
    static boolean check = true;
    static IMayTinh iMayTinh = new MayTinhService();
    static IColor iColor = new ColorService();
    static IOrder iOrder = new OrderService();

    public static void main(String[] args) {
        while (check) {
            System.out.println("1. Get Data");
            System.out.println("2. Bill");
            System.out.println("3. Edit Data");
            System.out.println("4. Insert Data");
            System.out.println("5. Delete Data");
            System.out.println("6. Exist");
            int selectOption = sc.nextInt();
            sc.nextLine();
            select(selectOption);
        }
    }

    public static void select(int selectOption) {
        switch (selectOption) {
            case 1:
                System.out.println("Lấy dữ liệu cho Máy(1) hoặc Color(2) hoặc Order(3)");
                int option = sc.nextInt();
                sc.nextLine();
                if (option == 1) {
                    iMayTinh.displayData(iMayTinh.getAll());
                } else if (option == 2) {
                    iColor.displayData(iColor.getAll());
                } else {
                    iOrder.displayData(iOrder.getAll());
                }
                break;
            case 2:
                System.out.println("Nhập id ");
                Long id = sc.nextLong();
                sc.nextLine();
                System.out.println("Nhập id máy tính ");
                Long idMay = sc.nextLong();
                sc.nextLine();
                System.out.println("Nhập tên máy ");
                String tenMay = sc.nextLine();
                System.out.println("Nhập số lượng máy ");
                int quantity = sc.nextInt();sc.nextLine();
                System.out.println("Nhập id màu ");
                Long idMau = sc.nextLong();
                sc.nextLine();
                System.out.println("Nhập tên màu ");
                String colorName = sc.nextLine();
                System.out.println("Nhập id Khách hàng ");
                Long idCustomer = sc.nextLong();sc.nextLine();
                System.out.println("Nhập Tên khách hàng ");
                String nameCustomer = sc.nextLine();
                System.out.println("Nhập số điện thoại");
                String phoneNumber = sc.nextLine();
                Date createDate = new Date();
                LinkedList<MayTinh> listMayTinh = new LinkedList<>();
               if(idMay.equals(9L)) {
                   iOrder.getCost(quantity, listMayTinh.get(0).getPrice());
               }
                break;

            case 3:
                //Edit data
                System.out.println("Sửa dữ liệu cho Máy(1) hoặc Color(2) hoặc Order(3)");
                int optionEdit = sc.nextInt();
                if (optionEdit == 1) {
                    System.out.println("Nhập id máy cần sửa");
                    Long idMayEdit = sc.nextLong();
                    sc.nextLine();
                    MayTinh mayTinh = iMayTinh.findById(idMayEdit);
                    System.out.println(" Nhập tên máy mới(1) hoặc Nhập giá máy mới(2) hoặc Nhập số lượng máy mới(3)");
                    int choose = sc.nextInt();
                    sc.nextLine();
                    iMayTinh.editMay(mayTinh);
                    if (choose == 1) {
                        System.out.println("Vui lòng nhập tên mới");
                        String nameNew = sc.nextLine();
                        mayTinh.setTenMay(nameNew);

                    } else if (choose == 2) {
                        System.out.println("Vui lòng nhập giá mới");
                        float newPrice = sc.nextFloat();
                        mayTinh.setPrice(newPrice);

                    } else {
                        System.out.println("Vui lòng nhập số lượng mới");
                        int newQuantity = sc.nextInt();
                        sc.nextLine();
                        mayTinh.setQuantity(newQuantity);

                    }
                } else if (optionEdit == 2) {
                    System.out.println("Nhập id màu cần sửa");
                    Long idMauEdit = sc.nextLong();
                    sc.nextLine();
                    Color color = iColor.findByColorId(idMauEdit);
                    iColor.editColor(color);
                    System.out.println("Nhập tên màu mới");
                    String nameColorNew = sc.nextLine();
                    color.setTenMau(nameColorNew);
                } else {
                    System.out.println("Nhập id Order cần sửa");
                    Long idOrderEdit = sc.nextLong();sc.nextLine();
                    Order order = iOrder.findByIdCustomer(idOrderEdit);
                    System.out.println("Nhập tên khách hàng mới(1) hoặc nhập số điện thoại khách hàng mới(2)");
                    int choose2 = sc.nextInt();sc.nextLine();
                    iOrder.editOrder(order);
                    if (choose2 == 1) {
                        System.out.println("Vui lòng nhập tên mới");
                        String nameCustomerNew = sc.nextLine();
                        order.setNameCustomer(nameCustomerNew);

                    } else {
                        System.out.println("Vui lòng nhập số điện thoại mới");
                        String phoneNumberNew = sc.nextLine();
                        order.setPhoneNumber(phoneNumberNew);

                    }
                }
                break;
                    case 4://Insert
                        System.out.println("Thêm thông tin cho máy(1) hoặc màu(2) hoặc order(3)");
                        int chooseInsert = sc.nextInt();sc.nextLine();
                        if (chooseInsert == 1) {
                            iMayTinh.insertMay(new MayTinh(5L, new Date("2022/08/14"), 10L, "Dell", 4, 250 ));
                            System.out.println("Thêm thành công");
                        } else if (chooseInsert == 2) {
                            iColor.insertColor((new Color(5L, new Date("2022/08/14"), 25L, "Xanh")));
                            System.out.println("Thêm thành công");
                        } else {
                            iOrder.insertOrder(new Order(5L, new Date("2022/08/14"), 35L, "Myt", "1267"));
                            System.out.println("Thêm thành công");
                        }
                        break;
                    case 5:
                        // remove
                        System.out.println("Xóa máy(1) hoặc màu(2) hoặc order(3)");
                        int chooseDelete = sc.nextInt();sc.nextLine();
                        if (chooseDelete == 1){
                            System.out.println("Nhập vào id máy cần xóa");
                            Long idMayXoa = sc.nextLong();
                            sc.nextLine();
                            iMayTinh.deleteMay(idMayXoa);
                            System.out.println("Xóa thành công");
                        } else if (chooseDelete == 2) {
                            System.out.println("Nhập vào id màu cần xóa");
                            Long colorIdXoa = sc.nextLong();sc.nextLine();
                            iColor.deleteColor(colorIdXoa);
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("Nhập vào id customer cần xóa");
                            Long customerIdXoa = sc.nextLong();sc.nextLine();
                            iOrder.deleteOrder(customerIdXoa);
                            System.out.println("Xóa thành công");
                        }
                        break;
                    case 6:
                        check = false;
                        break;

                }
        }
    }