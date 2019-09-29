package lecture_19;

import java.util.LinkedList;

public class mapusinglinkedlist {

         private LinkedList<Entity> entities = new LinkedList<>();
    private class Entity
    {
        String key ;
        String value ;

        public Entity(String key , String value)
        {
            this.key=key ;
            this.value = value;
        }

    }
    public void put(String key , String value)
    {
        for (Entity entity:entities) {
            if (entity.key.equals(key))
            {
                entity.value=value ;
                return;
            }
        }
        entities.add(new Entity(key ,value)) ;
    }

    public String get(String key )
    {
        for (Entity entity:entities) {
            if (entity.key.equals(key))
            {
                return entity.value;
            }
        }
        return null ;
    }
    public void remove(String key)
    {
        for (Entity entity:entities) {
            if (entity.key.equals(key))
            {
                entities.remove(entity);
                return;
            }
        }

    }

    @Override
    public String toString()
    {
        String s="";
        s+=("{");
        for (Entity entity: entities) {
           s+=(entity.key +" = " + entity.value + " , " );
        }
        s+=("}");
        return s ;
    }
}
