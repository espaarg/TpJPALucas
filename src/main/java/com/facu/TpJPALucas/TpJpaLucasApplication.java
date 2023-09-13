package com.facu.TpJPALucas;

import com.facu.TpJPALucas.entidades.*;
import com.facu.TpJPALucas.enums.EstadoPedido;
import com.facu.TpJPALucas.enums.FormaPago;
import com.facu.TpJPALucas.enums.TipoEnvio;
import com.facu.TpJPALucas.enums.TipoProducto;
import com.facu.TpJPALucas.repositorios.ClienteRepository;
import com.facu.TpJPALucas.repositorios.DomicilioRepository;
import com.facu.TpJPALucas.repositorios.RubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class TpJpaLucasApplication {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	RubroRepository rubroRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpJpaLucasApplication.class, args);
		System.out.println("Ando andando");

	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepo){
		return args -> {
			System.out.println("===========ALELUYA GLORIA ALELUYA=============");

			Cliente	cliente= new Cliente();
				cliente.setNombre("Juan");
				cliente.setApellido("Roman Riquelme");
				cliente.setEmail("yoshixd444@gmail.com");

			Domicilio domicilio1=Domicilio.builder()
					.calle("Avoidance Siempre Viva")
					.localidad("Islandia")
					.numero("dosCeroCeroSeis")
					.build();

			Pedido pedido1= Pedido.builder()
					.total(20000.00)
					.estado(EstadoPedido.INICIADO)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.build();

			Factura factura1=Factura.builder()
					.total(20302000)
					.descuento(23.01)
					.formaPago(FormaPago.EFECTIVO)
					.build();

			pedido1.setFactura(factura1);
			cliente.agregarPedido(pedido1);
			cliente.agregarDomicilio(domicilio1);

			Producto producto1=Producto.builder()
					.precioCompra(20.00)
					.precioVenta(300.00)
					.denominacion("Dignidad")
					.tipo(TipoProducto.MANUFACTURADO)
					.build();

			Producto producto2=Producto.builder()
					.precioCompra(220.00)
					.precioVenta(3030.00)
					.denominacion("Felicidad")
					.tipo(TipoProducto.MANUFACTURADO)
					.build();

			Rubro rubro1=Rubro.builder()
					.denominacion("Articulos de oficina")
					.build();

			rubro1.agregarProducto(producto1);
			rubro1.agregarProducto(producto2);

			clienteRepo.save(cliente);


			Cliente clienteRecuperado = clienteRepository.findById(cliente.getId()).orElse(null);
			if (clienteRecuperado != null){
				System.out.println("Nombre: "+ clienteRecuperado.getNombre());
				System.out.println("Apellido: "+ clienteRecuperado.getApellido());
				System.out.println("Email: "+ clienteRecuperado.getEmail());
			}


		};
	}

}
