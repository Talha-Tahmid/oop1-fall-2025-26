class Contact {
    String phone;
    String email;

    Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    void showInfo() {
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}
