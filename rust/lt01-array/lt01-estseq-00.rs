use std::io;
use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    todo!();
}

fn input_f64(texto: &str) -> f64 {
    let double: f64;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        double = match input.trim().parse() {
            Ok(n) => {
                if n >= 0.0 {
                    n
                } else {
                    println!("Valor inválido!");
                    continue;
                }
            }
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        return double;
    }
}

fn input_i32(texto: &str) -> i32 {
    let int: i32;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        int = match input.trim().parse() {
            Ok(n) => {
                if n >= 0 {
                    n
                } else {
                    println!("Valor inválido!");
                    continue;
                }
            }
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        return int;
    }
}

fn simple_random() -> u32 {
    let seed = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .unwrap()
        .as_nanos() as u32; // Convert time to a u32 seed

    // A very basic pseudo-random generator (LCG)
    let mut rng = seed;
    rng = rng.wrapping_mul(1664525).wrapping_add(1013904223);
    rng
}
