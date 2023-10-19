import java.util.ArrayList;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args){
        Menu menu = new Menu();

        Scanner scan = new Scanner(System.in);
        int mDecide = 1;
        do{
            menu.showProducts();
                
            System.out.print("What do you want to buy?: ");
            String order = scan.next().toLowerCase();

            System.out.print("Enter Quanity: ");
            int orderQuanity = scan.nextInt();

            if(order.equals("c1")){
                menu.getOrder(0,orderQuanity);
                System.out.println("Product added!");
            }
            else if(order.equals("c2")){
                menu.getOrder(1,orderQuanity);
                System.out.println("Product added!");
            }
            else if(order.equals("c3")){
                menu.getOrder(2,orderQuanity);
                System.out.println("Product added!");
            }
            else{
                System.out.println("Please enter a valid product!");
            }
            System.out.println("What do you want to do?");
            System.out.print("1. Add more product || 2. Go to Add-Ons || 3. Confirm Order || 4.Exit: " );
            int decide = scan.nextInt();
            
            switch(decide){
                case 1:
                    break;
                case 2:
                    int addOnDecide = 1;
                    do{
                        menu.showAddOnProducts();
                        System.out.print("What do you want to buy?: ");
                        String aOrder = scan.next().toLowerCase();

                        System.out.print("Enter Quanity: ");
                        int aOrderQuanity = scan.nextInt();
                        if(aOrder.equals("r1")){
                            menu.getAddOnsOrder(0, aOrderQuanity);
                        }
                        else if(aOrder.equals("r2")){
                            menu.getAddOnsOrder(1, aOrderQuanity);
                        }
                        else{
                            System.out.println("Invalid Option!");
                        }
                        System.out.print("What do you want to do? 1. Add more Add-Ons ||2.Go back to product menu || 3.Confirm Order || 4.Exit: ");
                        int aDecide = scan.nextInt();
                        switch(aDecide){
                            case 1:
                                addOnDecide = 1;
                                break;
                            case 2:
                                mDecide = 1;
                                addOnDecide--;
                                break;
                            case 3:
                                addOnDecide--;
                                System.out.print("What Currency do you want to be used? 1. PHP || 2. USD: ");
                                int aCDecide = scan.nextInt();

                                switch(aCDecide){
                                case 1:
                                    menu.showOrderProducts();
                                    mDecide--;
                                    break;
                                case 2:
                                    menu.showOrderProductsInDollar();
                                    mDecide--;
                                    break;
                                default:
                                    System.out.println("Invalid Option!");
                                }
                                break;
                            case 4:
                                addOnDecide--;
                                mDecide--;
                                break;
                            default:
                                System.out.println("Invalid Option!");
                        }
                        }while(addOnDecide > 0);
                    break;
                case 3:
                    System.out.print("What Currency do you want to be used? 1. PHP || 2. USD: ");
                    int cDecide = scan.nextInt();

                    switch(cDecide){
                        case 1:
                            menu.showOrderProducts();
                            mDecide--;
                            break;
                        case 2:
                            menu.showOrderProductsInDollar();
                            mDecide--;
                            break;
                        default:
                            System.out.println("Invalid Option!");
                    }
                    break;
                case 4:
                    mDecide--;
                    break;
                default:
                    System.out.println("Invalid Option!");
            }  
            }while(mDecide > 0);
        scan.close();
    }
}

class Product{
    private String name;
    private double price;
    private int quantity;
    private double totalPrice;

    public Product(String name, double price, int quantity, double totalPrice){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double getPrice(){
        return this.price;
    }

    public double getPriceToDollar(){
        return this.price / 56.50;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getName(){
        return this.name;
    }

    public double calculateTotalPrice(double price, int quantity){
        return price * quantity;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public double convertTotalToDollar(){
        return this.totalPrice / 56.50;
    }

    public void setQuantity(int quantity){
        this.quantity = this.quantity - quantity;
    }
}

class Menu{
    public ArrayList <Product> products = new ArrayList<Product>();{

    }
    public ArrayList <Product> addOns = new ArrayList<Product>();{

    }
    public ArrayList <Product> orderProduct = new ArrayList<Product>();{

    }

    public Menu(){
        Product c1 = new Product("C1", 100.00, 1000);
        Product c2 = new Product("C2", 150.00, 1000);
        Product c3 = new Product("C3", 200.00, 1000);
        Product r1 = new Product("R1", 35.00, 1000);
        Product r2 = new Product("R2", 50.00, 1000);

        products.add(c1);
        products.add(c2);
        products.add(c3);
        addOns.add(r1);
        addOns.add(r2);
    }

    public void showProducts(){
        System.out.println("==============MENU=============");
        for(Product product : products){
            System.out.println(product.getName() + " - " + "PHP " + product.getPrice() + " - " + "Quantity: " + product.getQuantity());
        }
    }

    public void showAddOnProducts(){
        System.out.println("==============Add-Ons=============");
        for(Product product : addOns){
            System.out.println(product.getName() + " - " + "PHP " + product.getPrice() + " - " + "Quantity: " + product.getQuantity());
        }
    }

    public void getOrder(int oIndex, int oQuantity){
        String oName = products.get(oIndex).getName();
        double oPrice = products.get(oIndex).getPrice();
        products.get(oIndex).setQuantity(oQuantity);
        double oTotalPrice = products.get(oIndex).calculateTotalPrice(oPrice, oQuantity);
        
        Product oProduct = new Product(oName,oPrice,oQuantity,oTotalPrice);
        orderProduct.add(oProduct);
    }

    public void getAddOnsOrder(int aIndex, int aQuantity){
        String aName = addOns.get(aIndex).getName();
        double aPrice = addOns.get(aIndex).getPrice();
        addOns.get(aIndex).setQuantity(aQuantity);
        double aTotalPrice = products.get(aIndex).calculateTotalPrice(aPrice, aQuantity);

        Product aProduct = new Product(aName,aPrice,aQuantity,aTotalPrice);
        orderProduct.add(aProduct);
    }

    public double calculateTotalAmount(){
        double totalAmount = 0.0;
        for (int i = 0; i < orderProduct.size(); i++){
            totalAmount += orderProduct.get(i).getTotalPrice();
        }
        return totalAmount;
    }

    public void showOrderProducts(){
        System.out.println("Here is your order!");
        for (int i = 0; i < orderProduct.size(); i++){
            System.out.println(orderProduct.get(i).getName() + " - " + "PHP " + orderProduct.get(i).getPrice() + " - " + "Quantity " + orderProduct.get(i).getQuantity() + " - " +"Total Price " + + orderProduct.get(i).getTotalPrice());
        }
        System.out.println("Total amount: PHP " + calculateTotalAmount());
        System.out.println("Thank you for your order!");
    }

    public void showOrderProductsInDollar(){
        System.out.println("Here is your order!");
        for (int i = 0; i < orderProduct.size(); i++){
            System.out.printf("%s - USD$%.2f - Quantity %d - Total Price USD$%.2f\n", orderProduct.get(i).getName(), orderProduct.get(i).getPriceToDollar(), orderProduct.get(i).getQuantity(), orderProduct.get(i).convertTotalToDollar());
        }
        System.out.printf("Total amount: USD$%.2f\n", calculateTotalAmount() / 56.50);
        System.out.println("Thank you for your order!");
}
}
