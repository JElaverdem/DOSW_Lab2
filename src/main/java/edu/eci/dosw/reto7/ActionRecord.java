package edu.eci.dosw.reto7;

public class ActionRecord {
	private final User user;
	private final Command command;
	private boolean undone;

	public ActionRecord(User user, Command command) {
		this.user = user;
		this.command = command;
	}

	public boolean isUndone() {
		return undone;
	}

	public void markAsUndone() {
		undone = true;
	}

	public Command getCommand() {
		return command;
	}

	public User getUser() {
		return user;
	}
}

