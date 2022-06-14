package br.utfpr.gof.chainOfResponsability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("master@hcode.com.br", "654321");
        server.registerUser("user@hcode.com.br", "123123");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do {
            System.out.println("Digite sua email: ");
            String email = reader.readLine();
            System.out.println("Digite sua senha: ");
            String passowrd = reader.readLine();
            done = server.login(email, passowrd);
        } while (!done);

    }
}
