package LineiniStrOtDanni;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentHashTable {
    Map<String, List<Integer>> mapDoc ;
    public DocumentHashTable() {
        mapDoc = new HashMap<>();
    }
    public void addDocument(int id, List<String> keywords) {
        for (String keyword : keywords) {
            if (!mapDoc.containsKey(keyword)) {
                mapDoc.put(keyword, new ArrayList<>());
            }
            List<Integer> documents = mapDoc.get(keyword);
            if (!documents.contains(id)) {
                documents.add(id);
            }
        }
    }

    public List<Integer> searchDocuments(String keyword) {
        return mapDoc.getOrDefault(keyword, new ArrayList<>());
    }
}
