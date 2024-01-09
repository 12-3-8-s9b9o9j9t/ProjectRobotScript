module.exports = {
    printWidth: 100,
    singleQuote: true,
    semi: false,
    trailingComma: 'all',
    arrowParens: 'always',
    plugins: ['prettier-plugin-tailwindcss'],
    overrides: [
        {
            files: ['*.js', '*.cjs', '*.mjs', '*.ts', '*.tsx', '*.cts', '*.mts'],
            options: {
                tabWidth: 4,
            },
        },
    ],
    //tailwindAttributes: [],
}
