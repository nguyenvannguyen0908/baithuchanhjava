package baithuchanhlab3.src.quanlidanhba;

public abstract class  contact {
    abstract void insertContact(String name, String phone_number);
    abstract void deleteContact(String name);
    abstract void updateContact(String name, String new_number);
    abstract void searchContact(String name);
}