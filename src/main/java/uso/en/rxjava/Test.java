package uso.en.rxjava;


import io.reactivex.Observable;

/**
 * Esta prueba es para saber como
 * se manejan las excepciones en rxjava
 * mientras se esta emitiendo.
 *
 * resultado:
 * recordar que siempre para que se pueda activar
 * el Osbervavle debe existir una susbscripción
 * de otra forma el Observable solo se queda en una intención.
 *
 * **/
public class Test {

  public static void main(String[] args){

    Observable observable = Observable.rangeLong(1, 5)
            .map(n -> n + 1)
                .map(n -> n/0)
                    .map(n -> {

                      System.out.println("ingreso al siguiente map");
                      return n;
                    });

/*    observable.subscribe(
        o -> {
          System.out.println("receiving "+o);
        }
    );*/

  }

  public static Integer mapper(int n){

    return n * 2;

  }

}
