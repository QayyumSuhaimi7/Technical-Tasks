using System;

class Program
{
    const char Safe = '√';
    const char Bomb = 'X';

    static void Main()
    {
        char[,] minefield = {
            { 'X', '√', 'X', 'X', 'X'},
            { 'X', 'X', '√', 'X', 'X'},
            { 'X', 'X', 'X', '√', 'X' },
            { 'X', 'X', 'X', '√', 'X' },
            { 'X', 'X', '√', 'X', 'X' }
        };

        int tx = 0, ty = 1, ax = -1, ay = -1;
        NavigateMinefield(minefield, tx, ty, ref ax, ref ay);
    }

    static void NavigateMinefield(char[,] minefield, int tx, int ty, ref int ax, ref int ay)
    {
        var rows = minefield.GetLength(0);
        var cols = minefield.GetLength(1);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (minefield[i, j] == Safe)
                {
                    Console.WriteLine($"Totoshka is at ({i}, {j})");
                    ax = tx;  
                    ay = ty;

                    tx = i; 
                    ty = j;

                    if (ax != -1 && ay != -1)
                        Console.WriteLine($"Ally is at ({ax}, {ay})");
                }
            }
        }
    }
}