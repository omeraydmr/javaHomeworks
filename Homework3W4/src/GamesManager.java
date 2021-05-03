
public class GamesManager implements GamesService{
	
	@Override
	public void addGame(Games games) {
		System.out.println("Id : "+ games.getId() + " Username : " + games.getGameName() + " is added.");
		
	}
	
	@Override
	public void removeGame(Games games) {
		System.out.println("Id : "+ games.getId() + " Username : " + games.getGameName() + " is removed.");
		
	}
	
	@Override
	public void updateGame(Games games) {
		System.out.println("Id : "+ games.getId() + " Username : " + games.getGameName() + " is updated.");
		
	}

	@Override
	public void getAllGame(Games[] games) {
		for(Games game : games) {
			System.out.println("Id : "+ game.getId() + " Username : " + game.getGameName() + ".");
		}
		
	}

}
