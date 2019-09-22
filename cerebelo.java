//lo que necesita el cerebelo para el try catch

	public void EscogerOpcion(){
        int Opcion = 14;
        boolean Seguir = true;
        while (Seguir){
            Opcion = interfaz.EscogerOpcion("\nMenu: \n1. Jugar \n2. Configurar cantidad de sets \n3. Configurar cantidad de tiros por set \n4. Ver Puntuacion mas alta \n5. SALIR");
            Seguir = !(1<= Opcion && Opcion <= 4);
        }   
		interfaz.setOpcion(Opcion);
    }
	
	public void DisplayOpcion(){
		switch (interfaz.getOpcion){
			case 1:
				//pones el metodo para iniciar el juego.
			break;
			case 2:
				juez.setSets(interfaz.ConfigurarSets());
			break;
			case 3:
				juez.setTiros(interfaz.ConfigurarTiros());
			break;
			case 4:
				//el metodo que tenga el juez para mostrar la puntuacion mas alta
			break;
			case 5:
				System.out.println("Adios vaquero");
			break;	
		}
	}
	
	public 