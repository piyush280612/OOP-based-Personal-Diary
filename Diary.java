package personalDiaryOOP;

import java.util.*; // For List, ArrayList, Map, HashMap

public class Diary {

    private List<Entry> entryList;

    private Map<String, Entry> entryMap;

    public Diary() {
        entryList = new ArrayList<>();
        entryMap = new HashMap<>();
    }

    // Add a new diary entry
    public void addEntry(Entry entry) {
        entryList.add(entry); // Adds to the list
        entryMap.put(entry.getTitle(), entry); // Maps title to the entry
    }

    // Return all diary entries
    public List<Entry> getAllEntries() {
        return entryList;
    }

    // Get an entry by its title
    public Entry getEntryByTitle(String title) {
        return entryMap.get(title); // Fast lookup
    }

    // Delete an entry using its title
    public boolean deleteEntry(String title) {
        Entry removed = entryMap.remove(title); // Remove from map
        if (removed != null) {
            entryList.remove(removed); // Remove from list too
            return true; // Success
        }
        return false; // Not found
    }
}

