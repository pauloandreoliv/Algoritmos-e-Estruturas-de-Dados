public class HashTable {
    
    int tableSize = 10;
    int size = 0;
    HashTableEntry[] hashTable = new HashTableEntry[tableSize];
    
    public String get(String key){
        int index = defineIndex(key);
        
        this.hashTable[index] == null ? null : this.hashTable[index].getValue();
    }
    
    private String defineIndex(String key){
        int hash = key.hashCode() < 0 ? key.hashCode() * (-1) : key.hashCode();
        int index = hash % this.tableSize;
        
        while (this.hashTable[index] != null && !this.hashTable[index].getKey().equals(key)){
            if(index == this.tableSize -1){
                index = 0;
            } else{
                index ++;
            }
        }
        
        return index;
    }
    
    public void add(String key, String value){
        if(this.size / this.tableSize > 0.5){
            rehash();
        }
        
        int index = defineIndex(key);
        this.hashTable[index] = new HashTableEntry(key,value);
    }
    
    private void rehash(){
        HashTableEntry[] temporary = this.hashTable;
        int tamanhoNovo = this.tableSize * 2;
        this.tableSize = HashTableEntry[tamanhoNovo];
        
        for(HashTableEntry entry : temporary) {
            this.hashTable.add(entry.getKey(),entry.getValue());
        }
    }
    
    private class HashTableEntry {
        private String key;
        private String value;
        
        private HashTableEntry {
            super();    
            this.key = key;
            this.value = value;
        }
        
        public void setKey(String key){
            this.key = key;
        }
        
        public void setValue(String value){
            this.value = value;
        }
        
        public String getKey){
            return this.key;
        }
        
        public String getValue(){
            return this.value;
        }
    }
}
