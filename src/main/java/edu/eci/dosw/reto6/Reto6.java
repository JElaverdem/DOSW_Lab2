package edu.eci.dosw.reto6;

public class Reto6 {
	public static void main(String[] args) {
		SupportHandler basic = new BasicTechnician("Ana");
		SupportHandler intermediate = new IntermediateTechnician("Luis");
		SupportHandler advanced = new AdvancedTechnician("Marta");
		basic.setNext(intermediate);
		intermediate.setNext(advanced);

		SupportManager manager = new SupportManager(basic);
		manager.addTicket(new Ticket("No inicia la impresora", TicketL.BASIC, TicketPriority.LOW));
		manager.addTicket(new Ticket("Error de configuracion", TicketL.INTERMEDIATE, TicketPriority.MEDIUM));
		manager.addTicket(new Ticket("Falla del servidor", TicketL.ADVANCED, TicketPriority.HIGH));
		manager.addTicket(new Ticket("Solicitud fuera de alcance", TicketL.BASIC, TicketPriority.HIGH));

		manager.processAllTickets();

		System.out.println("Tickets resueltos: " + manager.getResolvedTicketsCount());
		System.out.println("Tickets pendientes: " + manager.getPendingTicketsCount());
		System.out.println("Promedio de prioridad resuelta: " + manager.getAveragePriorityOfResolved());
	}
}
