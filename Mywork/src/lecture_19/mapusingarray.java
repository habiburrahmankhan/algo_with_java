package lecture_19;


public class mapusingarray {
     Entity entities[] = new Entity[100];

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
        int hash =Math.abs( key.hashCode()%entities.length );
        entities[hash]=new Entity(key ,value) ;

    }
    public String get(String key)
    {
        int hash =Math.abs( key.hashCode()%entities.length );
        if (entities[hash]!=null && entities[hash].key.equals(key))
        {
            return entities[hash].value ;
        }
        return null ;
    }
   public void remove(String key)
   {
       int hash =Math.abs( key.hashCode()%entities.length );
       if (entities[hash]!=null && entities[hash].key.equals(key))
       {
            entities[hash] = null;
       }
   }
   @Override
   public String toString()
   {
       String s ="" ;
       s+="({)" ;
       for (Entity entity: entities) {
           s+=(entity.key + " = " + entity.value  + " , ") ;
       }
       s+=("}");
       return s;
   }

}
