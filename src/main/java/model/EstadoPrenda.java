/*
No se si este es un buen approach al requerimiento del estado de una prenda,
tampoco se si la sintaxis estaria bien.
Pero creo que va por este camino.
    
*/


public enum EstadoPrenda{
    
    Integer usos = 0;

    public EstadoPrenda evaluarSiMuta(){
        Estado estadoEvaluado = this;
        this.usos += 1;
        if(puedeMutar()){
            estadoEvaluado = siguienteEstado();
        }
        return estadoEvaluado;
    }

    public EstadoPrenda dejarComoNueva(){
        this.usos = 0;
        return NUEVA;
    }
    
    
    NUEVA{
        @Override
        public EstadoPrenda siguienteEstado(){
            return SUCIA;
        }

        @Override
        public boolean puedeMutar(){
            return this.usos > 2;
        }
    },
    SUCIA{
        @Override
        public EstadoPrenda siguienteEstado(){
            return PERCUDIDA;
        }

        @Override
        public boolean puedeMutar(){
            return this.usos > 3;
        }
    },
    PERCUDIDA{
        @Override
        public EstadoPrenda siguienteEstado(){
            return PERCUDIDA;
        }

        @Override
        public boolean puedeMutar(){
            return false;
        }
    },
    LAVANDOSE{
        @Override
        public EstadoPrenda siguienteEstado(){
            return this;
        }

        @Override
        public boolean puedeMutar(){
            return false;
        }
    };
}