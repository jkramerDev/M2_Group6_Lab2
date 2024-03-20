package template;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<PhonebookEntry> entries;

    public Contact(String name) {
        this.name = name;
        this.entries = new ArrayList<>();
    }

    // Add an entry to the contact
    public void addEntry(PhonebookEntry entry) {
        entries.add(entry);
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<PhonebookEntry> getEntries() {
        return entries;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        // Simple hash code implementation; adjust for controlled collisions
        return name.length(); // This simplistic approach can cause collisions for names of the same length
    }
}