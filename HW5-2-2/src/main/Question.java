package main;

public abstract class Question {
	public String task;
	public int max_Value;
	public int q_id;

	public void question(int id, String task, int value) {
		this.q_id = id;
		this.task = task;
		this.max_Value = value;
	}
}
