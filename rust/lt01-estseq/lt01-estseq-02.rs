use std::io;

fn main() {
    let mut salario: f64;
    loop {
        println!("Insira o salário");
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Failed to read Line");
        salario = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                0.0
            }
        };
        if salario != 0.0 {
            break;
        }
    }
    salario *= 1.15;
    println!("O novo salario e: {:.2}", salario)
}
