use std::io;

fn main() {
    // comprimento input
    let comprimento: f64;
    loop {
        println!("Insira o comprimento do paralelepípedo: ");
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Erro de Leitura da linha!!");
        comprimento = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor Inválido!!");
                continue;
            }
        };
        break;
    }
    // largura input
    let largura: f64;
    loop {
        println!("Insira o largura do paralelepípedo: ");
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Erro de Leitura da linha!!");
        largura = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor Inválido!!");
                continue;
            }
        };
        break;
    }
    // altura input
    let altura: f64;
    loop {
        println!("Insira o altura do paralelepípedo: ");
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Erro de Leitura da linha!!");
        altura = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor Inválido!!");
                continue;
            }
        };
        break;
    }
    // Answers
    println!(
        "O volume do paralelepípedo é {}.",
        altura * comprimento * largura
    );
}
