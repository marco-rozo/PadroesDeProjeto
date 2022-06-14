package br.utfpr.gof.bridgePhones;

/**
 2) Considere que um usuário possui dois telefones celulares, de marcas diferentes, como
 Samsung e Xiaomi. Suponha que cada celular possui duas câmeras, uma frontal e outra
 traseira. Um programa deve permitir a realização de captura de fotos usando os dois celulares
 e as duas câmeras. O usuário final deve trabalhar com o dispositivo sem se preocupar com o
 uso das câmeras. Em vez de criar uma estrutura que considere as 4 diferentes combinações de
 câmeras de acordo com a marca, empregue o padrão de projeto GoF Bridge para separar as
 abstrações (Celulares de diferentes marcas) das suas implementações (Funcionamento das
 duas câmeras).
 Ao executar o programa, deve ser possível simular o uso das 4 possibilidades:
 Captura via celular Samsung
 Foto capturada via câmera frontal
 Captura via celular Samsung
 Foto capturada via câmera traseira
 Captura via celular Xiaomi
 Foto capturada via câmera frontal
 Captura via celular Xiaomi
 Foto capturada via câmera traseira

 */
public class Main {
    public static void main(String[] args) {
        ICell cellXiaomi =  new Xiaomi(new CameraBack(), new CameraFront()); //define o celular passando o tipo dele (Xiaomi) e passando as cameras
        ICell cellSamsung = new Samsung(new CameraBack(), new CameraFront());

        photographing(cellXiaomi); //passa para o metodo fotografando
        photographing(cellSamsung);
    }

    public static void photographing(ICell cell){
        //printa as informações das fotos
        cell.takePhoneBack();
        cell.takePhoneFront();
    }
}
