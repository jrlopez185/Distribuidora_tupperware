
public class Main {
	public class Distribuidora_tupperware {

		public static void main(String[] args) {
			
			final String nombreEmpresa = "Distribuidora TupeerWare";
			
			double costoUnitario = 35;// Q45.00
			int cantidadProducto = 400;
			double totalApagar = costoUnitario*cantidadProducto; //Q
			final double precioDeVenta = 50;
			final double IVA = 0.12;// 12%
			double TotalIVAPorUnidad = precioDeVenta*IVA;
			
			System.out.println("Costo por unidad: Q"+costoUnitario);
			System.out.println("Cantidad de producto "+cantidadProducto);
			System.out.println("----------------------");
			System.out.println("Total: Q"+totalApagar);
			
			System.out.println("venderse a: Q"+precioDeVenta);
			System.out.println("Impuesto establecido:"+IVA);
			System.out.println("Impuesto por unidad: Q"+TotalIVAPorUnidad);
			
			
			int cantidadProductoVendido = 60;
			double totalcobradosSinDescuento = cantidadProductoVendido*precioDeVenta;
			
			double totalConDescuento = 0;
			
			if(cantidadProductoVendido>=50) {
				
			}totalConDescuento = totalcobradosSinDescuento -(totalcobradosSinDescuento*0.05);
			
			
			double impuestototalADeclarar = totalConDescuento*IVA;
			double tipoDeDescuento = 0.5;
			double ganancias = totalcobradosSinDescuento - (cantidadProductoVendido*costoUnitario)-impuestototalADeclarar;
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("Cantidad Vendida: "+cantidadProductoVendido);
			System.out.println("Total sin descuento Q"+totalcobradosSinDescuento);
			System.out.println("Total con descuento Q"+totalConDescuento);
			System.out.println("IVA a declarar: Q"+ impuestototalADeclarar);
			System.out.println("Tipo de descuento: "+tipoDeDescuento );
			System.out.println("Ganancia:Q "+ganancias);
			
			
			System.out.println("----"+totalcobradosSinDescuento*0.05);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		}

	}
}
