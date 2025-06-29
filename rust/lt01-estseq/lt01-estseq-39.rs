fn main() {
    let mut soma = 0.0;
    for i in 0..=64 {
        soma += 2_f64.powf(i as f64);
        println!(
            "Casa {:2.} valor {} total {}",
            i,
            2_f64.powf(i as f64),
            soma
        );
    }
}
