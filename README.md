Laboratory 2— Maven

Team Members
|-----------------------------|-------------------------------------|-----------------|
| Name                        | Institutional Email                 | GitHub Username |
|-----------------------------|-------------------------------------|-----------------|
| Juan José Rivera López      |juan.rivera@escuelaing.edu.co        |Juanjorivlo      |
| Juan Esteban Laverde Mesa   |juan.lmesa@mail.escuelaing.edu.co    | JElaverdem      |
| Brian Steven Fierro Lechuga |brian.fierro-l@mail.escuelaing.edu.co| BrianFierro03   |
|-----------------------------|-------------------------------------|-----------------|
<<<<<<< HEAD

 Challenge Evidence & Technical Explanations

# Challenge 1 — Don Pepe's Store
[Challenge 1 evidence](resources/challenge1.png)
Pattern category: Behavioral.
Pattern used: Strategy.
Pattern justification:
Pattern application:
Contributions:
-Juan José Rivera: 
-Juan Esteban Laverde: 
-Brian Steven Fierro: 

# Challenge 2 — The Five-Star Chef
[Challenge 2 evidence](resources/challenge2.png)
Pattern category: Creational.
Pattern used: Builder.
Pattern justification:
Pattern application:
Contributions:
-Juan José Rivera: Burger, Ingredients.
-Juan Esteban Laverde: Challenge.
-Brian Steven Fierro: BurgerBuilder, StandardBurguerBuilder, FoodBuilder.

# Challenge 3 — The Kingdom of vehicles
[Challenge 3 evidence](resources/challenge3.png)
Pattern category: Creational.
Pattern used: Factory.
Pattern justification: We needed to take into account different factories that changed the characteristics of the vehicles created, so we opted to use Factory to get and use a factory depending if we wanted an economic, used or luxury vehicle.
Pattern application: We implemented a VehicleFactory interface that all the factories must implement, and then no matter what factory we use, the dealeship can use it even if he doesnt know exactly wich he must use, because all the factories make the cars depending of the vehicle the user wants.
Contributions:
-Juan José Rivera: Vehicle, LandVehicle, AirVehicle, WaterVehicle.
-Juan Esteban Laverde: EconomyFactory, UsedFactory, LuxuryFactory.
-Brian Steven Fierro: VehicleFactory, Dealership, Challenge.

# Challenge 4 — The Currency Exchange Scam
[Challenge 4 evidence](resources/challenge4.png)
Pattern category: Behavioral.
Pattern used: Strategy.
Pattern justification:
For the fourth challenge, we developed a currency converter that uses real and accurate exchange rates for each currency, rather than a single shared rate for all of them. The system allows users to trade in various currencies—such as USD, EUR, JPY, and COP—and manage multiple transactions simultaneously. To achieve this, we used *Java Streams* to easily group and calculate total amounts. We also applied design patterns to keep the conversion rules separate and organized, ensuring clean code.
Pattern application:We used the Strategy pattern to apply different exchange rates dynamically without messy code.
Contributions:
-Juan José Rivera: Currency, Challenge.
-Juan Esteban Laverde: Transaction, ExternalRateAdapter.
-Brian Steven Fierro: ConversionService, ExchangeStrategy.

# Challenge 5 — Customized Coffee
[Challenge 5 evidence](resources/challenge5.png)
Pattern category: Creational.
Pattern used: Builder.
Pattern justification:
Pattern application:
Contributions:
-Juan José Rivera: Topping, CoffeeCollector.
-Juan Esteban Laverde: CoffeeBuilder, Challenge.
-Brian Steven Fierro: Coffee.

# Challenge 6 — Talk to Technical Support
[Challenge 6 evidence](resources/challenge6.png)
Pattern category: Behavioral.
Pattern used: Chain of responsibility.
Pattern justification:
Challenge sixth involves a technical support system that manages incidents (tickets) of varying difficulty levels—basic, intermediate, and advanced—and different priorities. We use the “chain of responsibility” pattern and that when a technician cannot resolve an incident, it is automatically transferred to the next technician capable of handling it. We then use Java Streams to calculate statistics, as the number of resolved incidents, the number of pending incidents, and the average priority.
Pattern application:We applied the Chain of Responsibility pattern so that unresolved support tickets automatically pass to the next technician.
Contributions:
-Juan José Rivera: SupportManager, TicketL, Challenge.
-Juan Esteban Laverde: Ticket, TicketPriority.
-Brian Steven Fierro: SupportHandler, BasicTechnician, IntermediateTechnician, AdvancedTechnician.

# Challenge 7 — The Magic Remote Control
[Challenge 7 evidence](resources/challenge7.png)
Pattern category: Behavioral.
Pattern used: Command.
Pattern justification:We used the Command pattern to turn every remote action into an object that we can track and undo easily.
In Challenge seveth, we created a remote control capable of performing actions such as turning on lights, opening doors, adjusting the music volume, or moving the blinds. We used the Command pattern so that each action is saved as an object. This allows us to maintain a complete history of the actions performed, identify which user modified each device, and use an undo button to reverse any action if necessary.
Pattern justification:We used the Command pattern to turn every remote action into an object that we can track and undo easily.
Pattern application:
Contributions:
-Juan José Rivera: User, Door, OperateDoorCommand, RemoteControl, MoveBlindCommand, Challenge.
-Juan Esteban Laverde: Light, Command, AdjustVolumeCommand, ActionRecord.
-Brian Steven Fierro: WindowBlind, MusicSystem, TurnOnLightCommand.

# Challenge 8 — The UML zoo
[Challenge 8 evidence](resources/challenge8.png)
Pattern category:
Pattern used:
Pattern justification:
Pattern application:
Contributions:
-Juan José Rivera: HealthStatus, Habitat.
-Juan Esteban Laverde: Caretaker, Visitor, Challenge.
-Brian Steven Fierro: Animal, Mammal, Reptile, Bird.


Team Members:

Juan Esteban Laverde Mesa

Juan José Rivera Lopez

Brian Steven Fierro Lechuga

