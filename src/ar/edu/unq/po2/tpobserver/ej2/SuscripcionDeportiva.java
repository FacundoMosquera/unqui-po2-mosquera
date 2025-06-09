package ar.edu.unq.po2.tpobserver.ej2;

import java.util.function.Predicate;

public class SuscripcionDeportiva {
	
		private SportFan fan;
		private Predicate<Partido> filtro;
		
		public SuscripcionDeportiva(SportFan interesado, Predicate<Partido> filtro) { 
			this.fan = interesado;
			this.filtro = filtro;
		}

		public Predicate<Partido> getFiltro() {
			return filtro;
		}

		
		public SportFan getInteresado() {
			return fan;
		}
		
		public void notificarInteresado(Partido a) {
			this.fan.update(a);
		}
		
		public boolean cumple(Partido articulo) {
			return this.filtro.test(articulo);
		}
	}

