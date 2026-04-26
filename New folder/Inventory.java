class Inventory{
	
	
	private ArrayList<Item>item=new ArrayList<>();
	
	public void addItem(Item item){
		for(Item i:items){
			if(i.getItemId().equals(item.getItemId())){
				System.out.println("Item alredy exists!");
				return;
			}
		}
		
		item.add(item);
		System.out.println("Item added successfully.");
	}
	
	public void removeItem(String itemId){
		
		Iterator<Item> iterator=item.iterator();
		
		while (iterator.hasNext()){
			Item item = iterator.next();
			
			if(item.getItemId().equals(itemId)){
				iterator.remove();
				System.out.println("Item remove successfully.");
				return;
			}
		}
		
		System.out.println("Item not found!");
	}
	public void updateQuantity(String itemId,int quantity){
		
		for(Item item :item){
			
			if(item.getItemId().equals(itemId)){
				item.setQuantity(quantity);
				System.out.println("Quantity updated.");
				return;
			}
		}
		
		System.out.println("Item not found!");
	}
	
	public void searchById(String itemId){
		
		for(Item item:items().equalsIgnoreCase(name)){
			System.out.println(item);
			found=true;
		}
		
		if(!found){
			System.out.pritln("Item not found!");
		}
	}
	
	public void displayAll(){
		
		if(items.isEmpty()){
			System.out.println("Inventory is empty.");
			return;
		}
		
		for(Item item:item){
			System.out.println(item);
			
		}
	}
	
}