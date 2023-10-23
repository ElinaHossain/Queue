class Driver {
	
	public static void main(String[] args) {
      
      Queue<Game> queue = new Queue<Game>();
		
		Game game1 = new Game("Mario", 50);
		Game game2 = new Game("Sonic", 60);
		Game game3 = new Game("Minecraft", 25);
      Game game4 = new Game("Among Us", 5);
      Game game5 = new Game("Fortnite", 0);
      Game game6 = new Game("FC 24 Standard Edition", 62.99);
      Game game7 = new Game("Assassin’s Creed Mirage", 49.99);
      Game game8 = new Game("Madden NFL 24", 69.99);
      Game game9 = new Game("Grand Theft Auto IV", 6.99);
      Game game10 = new Game("The Crew™ Motorfest Standard Edition", 55.99);
      Game game11 = new Game("Red Dead Online", 20);
      Game game12 = new Game("Friday the 13th: The Game", 4.99);
      Game game13 = new Game("Far Cry 6 Deluxe Edition", 19.99);
      
        queue.add(game1);
        queue.add(game2);
        queue.add(game3);
        queue.add(game4);
        queue.add(game5);
        queue.add(game6);
        queue.add(game7);
        queue.add(game8);
        queue.add(game9);
        queue.add(game10);
        queue.add(game11);
        queue.add(game12);
        queue.add(game13);   
           
      boolean IsEmpty = queue.isEmpty();
      System.out.println("Is the queue Empty? " + IsEmpty);
      int size = queue.size();
      System.out.println("Size of queue: " + size);
      Game peek = queue.peek();
      System.out.println("Peek into queue after polling: " + queue.peek());
      boolean containsItem = queue.contains(game1);
      System.out.println("Does the queue contain game1?: " + containsItem);
      queue.poll();
      peek = queue.peek();
      System.out.println("Peek into queue after polling: " + queue.peek());
      size = queue.size();
      System.out.println("Size of queue: " + size);      
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();



		
		
		// Complete Driver described on Lecture 06 - Slide 16
	
	}


}