package lecture_19;


import java.util.ArrayList;
import java.util.LinkedList;


public class MapAL {
    private ArrayList <LinkedList<Entity>> list ;
    private int size=0;
    private float lf = 0.5f ;
    public MapAL()
    {
        list=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add(new LinkedList<>()) ;
        }
    }
    private class Entity {
        private String key;
        private String value;

        public Entity(String key, String value) {
            this.key = key ;
            this.value=value;
        }


        public void put(String key ,String value)
        {
            int hash = Math.abs(key.hashCode()%list.size());
            LinkedList<Entity> entities=list.get(hash);
            for (Entity entity:
                 entities) {
                if (entity.value.equals(key))
                {
                    entity.value=value;
                    return;
                }

            }
            if ((float)(size)/list.size() >lf)
            {
                rehash();
            }
               entities.add(new Entity(key , value));
            size++;
        }
        public void rehash()
        {
            ArrayList<LinkedList<Entity>> old = list ;
            list= new ArrayList<>();
            for (int i = 0; i <old.size()*2 ; i++) {
                list.add(new LinkedList<>());
            }
            for (LinkedList<Entity> entries:old
                 ) {
                for (Entity entity: entries) {
                    put(entity.key , entity.value);
                }
            }
        }


        public String get(String key)
        {
            int hash = Math.abs(key.hashCode()%list.size());
            LinkedList<Entity> entities=list.get(hash);
            for (Entity entity:entities) {
                if (entity.key.equals(key))
                {
                    return entity.value ;
                }
            }
            return null ;
        }
        public  void remove(String key)
        {
            int hash = Math.abs(key.hashCode()%list.size());
            LinkedList<Entity> entities=list.get(hash);
            Entity target = null ;
            for (Entity entity:
                 entities) {
                if (entity.key.equals(key))
                {
                    target=entity;
                }
            }
            entities.remove(target);

        }
        public boolean containsKey(String key)
        {
            return get(key)!=null ;
        }
        
    }
}
