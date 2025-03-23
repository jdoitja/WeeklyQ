package Weekly3;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook{
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. 비즈니스 연락처 추가\n" +
                    "2. 개인 연락처 추가\n" +
                    "3. 연락처 출력\n" +
                    "4. 연락처 검색\n" +
                    "5. 종료\n" +
                    "메뉴를 선택해주세요:");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    addBusinessContact(scanner);
                    break;
                case 2:
                    addPersonalContact(scanner);
                    break;
                case 3:
                    printContacts();
                    break;
                case 4:
                    searchContacts(scanner);
                    break;
                case 5:
                    System.out.println("종료합니다");
                    scanner.close();
                    return;
                default:
                    System.out.println("다시 선택해주세요");
            }
        }


    }
    public static void addBusinessContact(Scanner scanner){
        System.out.print("이름을 입력 :");
        String name = scanner.nextLine();
        System.out.print("연락처 입력 :");
        String phoneNumber = scanner.nextLine();
        System.out.print("회사명 입력 :");
        String company = scanner.nextLine();

        contacts.add(new BusinessContact(name, phoneNumber, company));
    }

    public static void addPersonalContact(Scanner scanner){
        System.out.print("이름을 입력 :");
        String name = scanner.nextLine();
        System.out.print("연락처 입력 :");
        String phoneNumber = scanner.nextLine();
        System.out.print("관계 입력 :");
        String relationship = scanner.nextLine();

        contacts.add(new PersonalContact(name, phoneNumber, relationship));
    }

    public static void printContacts(){
        for(Contact contact : contacts){
            System.out.println(contact);
            if(contacts.isEmpty()){
                System.out.println("비어있음");
            }
        }
    }

    public static void searchContacts(Scanner scanner){
        System.out.print("검색할 이름을 입력하세요 :");
        String nameTosearch = scanner.nextLine();

        System.out.println("검색결과");
        for(Contact contact : contacts) {
            if(contact.getName().equalsIgnoreCase(nameTosearch))  {
                System.out.println(contact);

            }
        }
    }
}
