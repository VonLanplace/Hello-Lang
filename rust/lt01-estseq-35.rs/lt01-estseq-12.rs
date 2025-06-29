use std::io;

fn main() {
    let mut nascimento: i16;
    let mut atual: i16;
    //Ano nascimento
    loop {
        loop {
            println!("Inisira o Anor de Nacimento: ");
            let mut input = String::new();
            io::stdin().read_line(&mut input).expect("Error read_line!");
            nascimento = match input.trim().parse() {
                Ok(n) => n,
                Err(_) => {
                    println!("Valor Inválido!");
                    continue;
                }
            };
            break;
        }
        //Ano atual
        loop {
            println!("Inisira o Anor de atual: ");
            let mut input = String::new();
            io::stdin().read_line(&mut input).expect("Error read_line!");
            atual = match input.trim().parse() {
                Ok(n) => n,
                Err(_) => {
                    println!("Valor Inválido!");
                    continue;
                }
            };
            break;
        }
        if atual > nascimento {
            break;
        } else {
            println!("O ano de Nascimento tem que ser menor que o atual!!");
        }
    }
    //calc
    println!("A idade daquia 17 anos será {}.", atual - nascimento + 15);
}
