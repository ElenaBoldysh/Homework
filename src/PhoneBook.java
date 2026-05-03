import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    // Конструктор
    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (contacts.containsKey(surname)) {
            contacts.get(surname).add(phone);
        } else {
            // Если фамилии ещё нет — создаём новый список с одним телефоном
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(surname, phones);
        }
    }

    public List<String> get(String surname) {
        // Возвращаем список телефонов для данной фамилии или пустой список, если фамилия не найдена
        return contacts.getOrDefault(surname, new ArrayList<>());
    }
}
