package ru.geekbrains;


    class Staff {

        String name;
        String profession;
        String email;
        String phone;
        int salary;
        int age;

        public Staff(String name, String profession, String email, String phone, int salary, int age) {
            this.name = name;
            this.profession = profession;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void print() {
            System.out.println("Name: " + name + "  Profession: " + profession + "  Email: " + email + "  Phone: " + phone + "  Salary: " + salary + "  Age: " + age);
        }

        public static void main(String[] args) {

            Staff[] staffArray = new Staff[5];
            staffArray[0] = new Staff("Прохор", "Директор", "p@writer.be.ru", "89999999999", 500000, 50);
            staffArray[1] = new Staff("Дуня", "Разработчик", "du@writer.be.ru", "89999999998", 400000, 45);
            staffArray[2] = new Staff("Селиван", "Тестировщик", "s@writer.be.ru", "89999999997", 400000, 22);
            staffArray[3] = new Staff("Фекла", "Дизайнер", "f@writer.be.ru", "89999999996", 300000, 30);
            staffArray[4] = new Staff("Демьян", "Психолог", "de@writer.be.ru", "89999999995", 700000, 44);
            for (int i = 0; i < 5; i++)
                if (staffArray[i].age > 40) {
                    staffArray[i].print();
                }


        }
    }









