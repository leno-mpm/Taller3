
//SOLUCION DE LA VIOLACIÓN DEL PRINCIPIO OPEN-CLOSED
public class CloudServicePlatform {
    private Cloud cloudProvider;
  
  	public CloudServicePlatform (Cloud cloudProvider){
      	this.cloudProvider=cloudProvider;
    }
    public void hostingTo (AppWeb app) {
      	cloudProvider.hostingTo(app); 
    }
    // More Methods
}

// Se agregó esta interfaz para aplicar el principio de abierto/cerrado (Open-Closed).
// Ahora CloudServicePlatform no depende directamente de clases concretas como AWS o Azure,
// sino que depende de una interfaz (Cloud), lo que permite extender el sistema
// con nuevos servicios en la nube sin modificar el código existente.
// Cada clase que represente un servicio de nube debe implementar esta interfaz.
interface Cloud{
  	void hostingTo(AppWeb app);
}

class SCAww implements Cloud{
  	@Override 
  	public void hostingTo(AppWeb app){
      	System.out.println("Connect to AWS");
    }
}

class SCMAzure implements Cloud{
  	@Override 
  	public void hostingTo(AppWeb app){
      	System.out.println("Connect to Microsoft Azure");
    }
}


class SCGoogleC implements Cloud{
  	@Override 
  	public void hostingTo(AppWeb app){
      	System.out.println("Connect to Google Cloud");
    }
}
